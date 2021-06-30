import { Box, makeStyles, TextField } from "@material-ui/core";
const useStyles = makeStyles(theme =>({

        
        textfield:{
            width:"100%",
            marginTop:theme.spacing(1.5),
            '& .MuiOutlinedInput-input':{
                padding:`${theme.spacing(1.25)}px ${theme.spacing(2)}px`,
              
            },
         
            
        },
        lb:{
            color:"gray",
            fontSize:"0.9rem",
            textTransform:"capitalize"
        }
      

}))
const Field = ({type="text",name="name",ph, labal, multiline=false }) => {
    const classes = useStyles();
    return  <Box>
            <label className={classes.lb}>{labal}</label>
            <TextField
                
                className={classes.textfield}
               
                variant="outlined"
                name={name}
                type={type}
                placeholder={ph}
                multiline={multiline}
                rows={2}                
                
            />
            </Box>
}
 
export default Field;