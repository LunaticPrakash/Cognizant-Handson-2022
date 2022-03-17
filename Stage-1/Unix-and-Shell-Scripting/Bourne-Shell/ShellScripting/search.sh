while read line
do
        if [[ $line =~ Male$ ]]
        then
                printf '%s\n' $line >> male_nominee.txt
        fi
        if [[ $line =~ Female$ ]]
        then
                printf '%s\n' $line >> female_nominee.txt
        fi
done < names.txt