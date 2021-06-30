import { Grid, makeStyles } from "@material-ui/core";
const useStyles = makeStyles(theme =>({

      root:{
          marginTop:theme.spacing(1),
          marginBottom:theme.spacing(1)
      }
      

}))

const Group = ({children}) => {
    const classes = useStyles()
    return <Grid container className={classes.root} spacing={2}>
            {children}
    </Grid>
}
 
export default Group;