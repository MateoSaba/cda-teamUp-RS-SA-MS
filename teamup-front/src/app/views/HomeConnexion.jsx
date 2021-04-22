import React, { Component } from 'react';
import LoginForm from './../components/header-footer/LoginForm';
import '../assets/css/HomeConnexion.css'
import '../assets/css/pagecontent.css'
class Home extends Component {
    render() {
        return (
            <div className="container-fluid page-content test">
 <h1 className="text-center text-white">BIENVENUE SUR TEAM UP</h1>
                 <LoginForm/> 

            </div>
               
           
        );
    }
}

export default Home;