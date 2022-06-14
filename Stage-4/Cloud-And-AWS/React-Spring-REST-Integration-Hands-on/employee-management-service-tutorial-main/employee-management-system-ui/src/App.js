import { BrowserRouter, Routes, Route } from "react-router-dom";
import "./App.css";
import AddEmployee from "./components/AddEmployee";
import EmployeeList from "./components/EmployeeList";
import Navbar from "./components/Navbar";
import UpdateEmployee from "./components/UpdateEmployee";

function App() {
  return (
    <>
      <BrowserRouter>
        <Navbar />
        <Routes>
          <Route index element={<EmployeeList />} />
          <Route path="/" element={<EmployeeList />}></Route>
          <Route path="/employeeList" element={<EmployeeList />} />
          <Route path="/addEmployee" element={<AddEmployee />} />
          <Route path="/editEmployee/:id" element={<UpdateEmployee />} />
        </Routes>
      </BrowserRouter>
    </>
  );
}

export default App;
