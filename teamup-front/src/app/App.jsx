import Routes from './shared/routes/Routes.jsx';
import './App.css';
import { BrowserRouter as Router} from 'react-router-dom';
import NavBar from './components/header-footer/NavBar';


function App() {
  return (
    <>
    <Router>
      <NavBar />
      <Routes />
    </Router>
  </>
    );
}

export default App;
