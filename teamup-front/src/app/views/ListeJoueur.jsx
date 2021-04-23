import React, { Component } from 'react';
import '../assets/css/Historique.css'
import '../assets/css/util.css'
import '../assets/css/pagecontent.css'

class ListeJoueur extends Component {
    render() {
        return (
           
<div class="limiter page-content">
<h1 className="titre-histo">Les joueurs</h1>

		<div class="container-table100">
			<div class="wrap-table100">
				<div class="table100 ver1 m-b-110">
					<div class="table100-head">
						<table>
							<thead>
								<tr class="row100 head">
									<th class="cell100 column1">Nom</th>
									<th class="cell100 column2">Prénom</th>
									<th class="cell100 column3">Poste préféré</th>
									<th class="cell100 column4">Dernier match</th>
									<th class="cell100 column5">Points</th>
								</tr>
							</thead>
						</table>
					</div>

					<div class="table100-body js-pscroll">
						<table>
							<tbody>
								<tr class="row100 body">
									<td class="cell100 column1">Like a butterfly</td>
									<td class="cell100 column2">Boxing</td>
									<td class="cell100 column3">9:00 AM - 11:00 AM</td>
									<td class="cell100 column4">Aaron Chapman</td>
									<td class="cell100 column5">10</td>
								</tr>

								<tr class="row100 body">
									<td class="cell100 column1">Mind & Body</td>
									<td class="cell100 column2">Yoga</td>
									<td class="cell100 column3">8:00 AM - 9:00 AM</td>
									<td class="cell100 column4">Adam Stewart</td>
									<td class="cell100 column5">15</td>
								</tr>

								<tr class="row100 body">
									<td class="cell100 column1">Crit Cardio</td>
									<td class="cell100 column2">Gym</td>
									<td class="cell100 column3">9:00 AM - 10:00 AM</td>
									<td class="cell100 column4">Aaron Chapman</td>
									<td class="cell100 column5">10</td>
								</tr>

								<tr class="row100 body">
									<td class="cell100 column1">Wheel Pose Full Posture</td>
									<td class="cell100 column2">Yoga</td>
									<td class="cell100 column3">7:00 AM - 8:30 AM</td>
									<td class="cell100 column4">Donna Wilson</td>
									<td class="cell100 column5">15</td>
								</tr>

								<tr class="row100 body">
									<td class="cell100 column1">Playful Dancer's Flow</td>
									<td class="cell100 column2">Yoga</td>
									<td class="cell100 column3">8:00 AM - 9:00 AM</td>
									<td class="cell100 column4">Donna Wilson</td>
									<td class="cell100 column5">10</td>
								</tr>

								<tr class="row100 body">
									<td class="cell100 column1">Zumba Dance</td>
									<td class="cell100 column2">Dance</td>
									<td class="cell100 column3">5:00 PM - 7:00 PM</td>
									<td class="cell100 column4">Donna Wilson</td>
									<td class="cell100 column5">20</td>
								</tr>

								<tr class="row100 body">
									<td class="cell100 column1">Cardio Blast</td>
									<td class="cell100 column2">Gym</td>
									<td class="cell100 column3">5:00 PM - 7:00 PM</td>
									<td class="cell100 column4">Randy Porter</td>
									<td class="cell100 column5">10</td>
								</tr>

								<tr class="row100 body">
									<td class="cell100 column1">Pilates Reformer</td>
									<td class="cell100 column2">Gym</td>
									<td class="cell100 column3">8:00 AM - 9:00 AM</td>
									<td class="cell100 column4">Randy Porter</td>
									<td class="cell100 column5">10</td>
								</tr>

								<tr class="row100 body">
									<td class="cell100 column1">Supple Spine and Shoulders</td>
									<td class="cell100 column2">Yoga</td>
									<td class="cell100 column3">6:30 AM - 8:00 AM</td>
									<td class="cell100 column4">Randy Porter</td>
									<td class="cell100 column5">15</td>
								</tr>

								<tr class="row100 body">
									<td class="cell100 column1">Yoga for Divas</td>
									<td class="cell100 column2">Yoga</td>
									<td class="cell100 column3">9:00 AM - 11:00 AM</td>
									<td class="cell100 column4">Donna Wilson</td>
									<td class="cell100 column5">20</td>
								</tr>

								<tr class="row100 body">
									<td class="cell100 column1">Virtual Cycle</td>
									<td class="cell100 column2">Gym</td>
									<td class="cell100 column3">8:00 AM - 9:00 AM</td>
									<td class="cell100 column4">Randy Porter</td>
									<td class="cell100 column5">20</td>
								</tr>

								<tr class="row100 body">
									<td class="cell100 column1">Like a butterfly</td>
									<td class="cell100 column2">Boxing</td>
									<td class="cell100 column3">9:00 AM - 11:00 AM</td>
									<td class="cell100 column4">Aaron Chapman</td>
									<td class="cell100 column5">10</td>
								</tr>

								<tr class="row100 body">
									<td class="cell100 column1">Mind & Body</td>
									<td class="cell100 column2">Yoga</td>
									<td class="cell100 column3">8:00 AM - 9:00 AM</td>
									<td class="cell100 column4">Adam Stewart</td>
									<td class="cell100 column5">15</td>
								</tr>

								<tr class="row100 body">
									<td class="cell100 column1">Crit Cardio</td>
									<td class="cell100 column2">Gym</td>
									<td class="cell100 column3">9:00 AM - 10:00 AM</td>
									<td class="cell100 column4">Aaron Chapman</td>
									<td class="cell100 column5">10</td>
								</tr>

								<tr class="row100 body">
									<td class="cell100 column1">Wheel Pose Full Posture</td>
									<td class="cell100 column2">Yoga</td>
									<td class="cell100 column3">7:00 AM - 8:30 AM</td>
									<td class="cell100 column4">Donna Wilson</td>
									<td class="cell100 column5">15</td>
								</tr>

								<tr class="row100 body">
									<td class="cell100 column1">Playful Dancer's Flow</td>
									<td class="cell100 column2">Yoga</td>
									<td class="cell100 column3">8:00 AM - 9:00 AM</td>
									<td class="cell100 column4">Donna Wilson</td>
									<td class="cell100 column5">10</td>
								</tr>

								<tr class="row100 body">
									<td class="cell100 column1">Zumba Dance</td>
									<td class="cell100 column2">Dance</td>
									<td class="cell100 column3">5:00 PM - 7:00 PM</td>
									<td class="cell100 column4">Donna Wilson</td>
									<td class="cell100 column5">20</td>
								</tr>

								<tr class="row100 body">
									<td class="cell100 column1">Cardio Blast</td>
									<td class="cell100 column2">Gym</td>
									<td class="cell100 column3">5:00 PM - 7:00 PM</td>
									<td class="cell100 column4">Randy Porter</td>
									<td class="cell100 column5">10</td>
								</tr>

								<tr class="row100 body">
									<td class="cell100 column1">Pilates Reformer</td>
									<td class="cell100 column2">Gym</td>
									<td class="cell100 column3">8:00 AM - 9:00 AM</td>
									<td class="cell100 column4">Randy Porter</td>
									<td class="cell100 column5">10</td>
								</tr>

								<tr class="row100 body">
									<td class="cell100 column1">Supple Spine and Shoulders</td>
									<td class="cell100 column2">Yoga</td>
									<td class="cell100 column3">6:30 AM - 8:00 AM</td>
									<td class="cell100 column4">Randy Porter</td>
									<td class="cell100 column5">15</td>
								</tr>

								<tr class="row100 body">
									<td class="cell100 column1">Yoga for Divas</td>
									<td class="cell100 column2">Yoga</td>
									<td class="cell100 column3">9:00 AM - 11:00 AM</td>
									<td class="cell100 column4">Donna Wilson</td>
									<td class="cell100 column5">20</td>
								</tr>

								<tr class="row100 body">
									<td class="cell100 column1">Virtual Cycle</td>
									<td class="cell100 column2">Gym</td>
									<td class="cell100 column3">8:00 AM - 9:00 AM</td>
									<td class="cell100 column4">Randy Porter</td>
									<td class="cell100 column5">20</td>
								</tr>
							</tbody>
						</table>
					</div>
				</div>
				
			
			</div>
		</div>
	</div>

    


         
        );
    }
}

export default ListeJoueur;