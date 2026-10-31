.class public interface abstract Ll/֨֨᩵;
.super Ljava/lang/Object;
.source "19T4"


# static fields
.field public static final ᩴ:[I

.field public static final ᩵:[Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 11

    const/16 v0, 0xa

    new-array v0, v0, [I

    .line 41
    fill-array-data v0, :array_0

    sput-object v0, Ll/֨֨᩵;->ᩴ:[I

    const-string v9, "The service is not available"

    const-string v10, "The list of servers for this workgroup is not currently available."

    const-string v1, "The operation completed successfully."

    const-string v2, "Access is denied."

    const-string v3, "No more connections can be made to this remote computer at this time because there are already as many connections as the computer can accept."

    const-string v4, "The pipe state is invalid."

    const-string v5, "All pipe instances are busy."

    const-string v6, "The pipe is being closed."

    const-string v7, "No process is on the other end of the pipe."

    const-string v8, "More data is available."

    .line 46
    filled-new-array/range {v1 .. v10}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ll/֨֨᩵;->᩵:[Ljava/lang/String;

    return-void

    :array_0
    .array-data 4
        0x0
        0x5
        0x47
        0xe6
        0xe7
        0xe8
        0xe9
        0xea
        0x888
        0x17e6
    .end array-data
.end method
