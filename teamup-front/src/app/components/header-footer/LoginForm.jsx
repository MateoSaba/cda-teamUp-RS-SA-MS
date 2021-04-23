import React, { Component } from 'react';
import '../../assets/css/LoginFormCss.css';

class LoginForm extends Component {
    render() {
        return (
            <div className="wrapper fadeInDown">
            <div id="formContent">
         
            <div class="fadeIn first">
      <img  src="https://img.icons8.com/cotton/64/000000/football-ball.png" alt=""/>
      <img  src="https://img.icons8.com/cotton/64/000000/football-ball.png" alt=""/>
      <img  src="https://img.icons8.com/cotton/64/000000/football-ball.png" alt=""/>
      <img  src="https://img.icons8.com/cotton/64/000000/football-ball.png" alt=""/>
    </div>

              <form>
              <input type="text" id="login" class="fadeIn second" name="login" placeholder="login"/>
                <input type="text" id="password" class="fadeIn third mb-3" name="login" placeholder="password"/>
                  <input type="submit" class="fadeIn fourth" value="Log In"/>
              </form>

          
            </div>
          </div>
        );
    }
}

export default LoginForm;