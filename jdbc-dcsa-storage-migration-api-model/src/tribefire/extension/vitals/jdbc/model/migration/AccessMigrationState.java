// ============================================================================
// Copyright BRAINTRIBE TECHNOLOGY GMBH, Austria, 2002-2022
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
// ============================================================================
package tribefire.extension.vitals.jdbc.model.migration;

import java.util.Date;

import com.braintribe.model.generic.GenericEntity;
import com.braintribe.model.generic.annotation.SelectiveInformation;
import com.braintribe.model.generic.reflection.EntityType;
import com.braintribe.model.generic.reflection.EntityTypes;

/**
 * @author peter.gazdik
 */
@SelectiveInformation("${accessId} Migration")
public interface AccessMigrationState extends GenericEntity {

	EntityType<AccessMigrationState> T = EntityTypes.T(AccessMigrationState.class);

	String getAccessId();
	void setAccessId(String accessId);

	Date getStart();
	void setStart(Date start);

	Date getEnd();
	void setEnd(Date end);

	int getOpsDone();
	void setOpsDone(int opsDone);

	int getOpsTotal();
	void setOpsTotal(int opsTotal);

	int getResDone();
	void setResDone(int resDone);

	long getResSizeDone();
	void setResSizeDone(long resSizeDone);

	String getTimeTotal();
	void setTimeTotal(String timeTotal);

	String getTimeOpsDownload();
	void setTimeOpsDownload(String timeOpsDownload);

	String getTimeResDownload();
	void setTimeResDownload(String timeResDownload);

}
