import './App.css';
import {BrowserRouter as Router, Route, Switch} from 'react-router-dom';
import ListEmployeeComponent from './components/ListEmployeeComponent';
import LoginComponent from './components/LoginComponent';
import ViewPageComponent from './components/ViewPageComponent';
import AddEmployeeComponent from './components/AddEmployeeComponent';
import UpdateEmployeeComponent from './components/UpdateEmployeeComponent';

import NavBar from './components/NavBar';



function App() {
  return (
    <div className="Container">
     
      <Router>
        <NavBar/>
        <div className="container">
        
          <Switch>
              <Route path="/" exact component={ViewPageComponent} ></Route>
              <Route path="/Login" component={LoginComponent} ></Route>
              <Route path="/AllEmployees" component={ListEmployeeComponent} ></Route>
              <Route path="/AddEmployees" component={AddEmployeeComponent} ></Route>
              <Route path="/UpdateEmployee/:empId" component={UpdateEmployeeComponent} ></Route>
          </Switch>
        </div>
      </Router>
      
    </div>
  );
}

export default App;
