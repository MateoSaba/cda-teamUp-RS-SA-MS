import React, { Component } from 'react';
import TodoList from '../components/EquipeBleue/TodoList.jsx';
import TodoList2 from '../components/EquipeJaune/TodoList2.jsx';
import './../assets/css/Participer.css'
import './../assets/css/pagecontent.css'

class Participer extends Component {
  render() {
    return (
      <>
        <div className="container-fluid page-content">
          <h1 className="titre-profil text-center titre-creer">Participer au match !</h1>

          <div className="row compo-todo ">

            <div className="todo-app md-6 ml-6 ">
              <TodoList />
            </div>

            <div div className="todo-app2 md-6 ml-6">
              <TodoList2 />
            </div>
          </div>
        </div>


      </>
    );
  }
}

export default Participer;