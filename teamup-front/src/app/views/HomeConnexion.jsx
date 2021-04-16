import React, { Component } from 'react';
import LoginForm from './../components/header-footer/LoginForm';
import HomeConnexion from '../assets/css/HomeConnexion.css'
class Home extends Component {
    render() {
        return (
            <>
                <h1 className="text-center">BIENVENUE SUR TEAM UP</h1>
                 <LoginForm/> 
            </>
        );
    }
}

export default Home;