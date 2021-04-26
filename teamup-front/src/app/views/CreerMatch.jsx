import React, { Component } from 'react';
import TodoList from '../components/EquipeBleue/TodoList.jsx';
import TodoList2 from '../components/EquipeJaune/TodoList2.jsx';
import './../assets/css/CreerMatch.css'
import './../assets/css/pagecontent.css'


class CreerMatch extends Component {
  render() {
    return (
      <>
        <div className="container-fluid page-content">
          <h1 className="titre-profil text-center titre-creer">Organiser une rencontre</h1>

          <div className="row compo-todo margetop">

            <div className="md-6 ml-6 m-0 largeur">
              <div id="formContent" className="m-auto">
                <form>
                  <h1 className="mt-3 mb-3 titre-information">Info du match</h1>
                  <input type="text" id="titre" class=" third mb-3" name="titre" placeholder="Titre du match" />
                  <div class="form-group mb-2">
                    <label for="exampleFormControlSelect1" className='tests'>Nombre de joueurs :</label>
                    <select class="form-control formulaire" id="exampleFormControlSelect1">
                      <option>1</option>
                      <option>2</option>
                      <option>3</option>
                      <option>4</option>
                      <option>5</option>
                      <option>6</option>
                      <option>7</option>
                      <option>8</option>
                      <option>9</option>
                      <option>10</option>
                      <option>11</option>
                      <option>12</option>
                      <option>13</option>
                      <option>14</option>
                    </select>
                  </div>
                  <label for="exampleFormControlSelect1" className='tests'>Date du match : </label><br />
                  <input className="mb-4" type="date" id="start" name="trip-start" value="2018-07-22" min="2018-01-01" max="2018-12-31" /> <br />
                  <input type="submit" class=" fourth" value="Sauvegarder" />
                </form>
              </div>
            </div>

            <div className="todo-app md-3 ml-3 m-0 largeur">
              <TodoList />
            </div>

            <div div className="todo-app2 md-3 ml-3 m-0 largeur">
              <TodoList2 />
            </div>
          </div>
        </div>


      </>
    );
  }
}

export default CreerMatch;