import os
from employeeDataProcess import EmployeeDataProcess

def main():
    # Print the current working directory
    print("Current working directory:", os.getcwd())
    
    # Get the directory of the current script
    script_dir = os.path.dirname(os.path.abspath(__file__))
    
    # Construct the file path relative to the script's location
    file_path = os.path.join(script_dir, 'pandas_practice_dataset.csv')
    
    # Check if the file exists
    if not os.path.isfile(file_path):
        print(f"File not found: {file_path}")
        return
    
    process = EmployeeDataProcess(file_path)
    process.display_first_10_rows()
    process.display_last_5_rows()

if __name__ == "__main__":
    main()
