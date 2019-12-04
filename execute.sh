#!/bin/bash

stty -echo

echo "***********************************************"
echo "*** STEP : MOVE File"
echo "***********************************************"
scp -r /var/jenkins_home/workspace/ta_test root@worker2:/root

echo "***********************************************"
echo "*** end"
