import { Outlet } from "react-router-dom";
import Header from "./components/Header";
import Footer from "./components/Footer";
import 'react-toastify/dist/ReactToastify.css';
import { ToastContainer } from 'react-toastify';

function App() {
  return (
    <div className="min-h-screen flex flex-col">
      <Header />
      {/* flex-1 makes this section grow and push the footer to the bottom */}
      <main className="flex-1">
        <Outlet />
      </main>
      <Footer />
      <ToastContainer position="top-center" />
    </div>
  );
}

export default App;
