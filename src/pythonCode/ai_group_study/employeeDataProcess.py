import pandas as pd

class EmployeeDataProcess:
    def __init__(self, file_path):
        self.data = pd.read_csv(file_path)
    
    def display_first_10_rows(self):
        print(self.data.head(10))
        
    def display_last_5_rows(self):
        print(self.data.tail(5))

# Example usage:
# process = EmployeeDataProcess('path_to_your_file.csv')
# process.display_first_10_rows()
# process.display_last_5_rows()