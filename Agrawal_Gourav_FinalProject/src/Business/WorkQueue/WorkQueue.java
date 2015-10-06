/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Enterprise.Enterprise;
import java.util.ArrayList;

/**
 *
 * @author gourav
 */
public class WorkQueue {
    
    private ArrayList<WorkRequest> workRequestList;
    private Enterprise enterprise;

    public WorkQueue() {
        workRequestList = new ArrayList<>();
    }

    public ArrayList<WorkRequest> getWorkRequestList() {
        return workRequestList;
    }
    
    public void addWorkRequest(WorkRequest workrequest){
        
        this.workRequestList.add(workrequest);
    }
    
    
    
    public WorkRequest searchByID(int ID)
    {
        for(WorkRequest workRequest: workRequestList)
        {
            if(workRequest.getId()==(ID))
                    
            {
                return workRequest;
            }
        }
        return null;
    }
}