.class public final enum Lnet/engio/mbassy/bus/MessagePublication$State;
.super Ljava/lang/Enum;
.source "MessagePublication.java"


# static fields
.field public static final synthetic $VALUES:[Lnet/engio/mbassy/bus/MessagePublication$State;

.field public static final enum Finished:Lnet/engio/mbassy/bus/MessagePublication$State;

.field public static final enum Initial:Lnet/engio/mbassy/bus/MessagePublication$State;

.field public static final enum Running:Lnet/engio/mbassy/bus/MessagePublication$State;

.field public static final enum Scheduled:Lnet/engio/mbassy/bus/MessagePublication$State;


# direct methods
.method public static constructor <clinit>()V
    .locals 9

    .line 115
    new-instance v0, Lnet/engio/mbassy/bus/MessagePublication$State;

    const-string v1, "Initial"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lnet/engio/mbassy/bus/MessagePublication$State;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lnet/engio/mbassy/bus/MessagePublication$State;->Initial:Lnet/engio/mbassy/bus/MessagePublication$State;

    new-instance v1, Lnet/engio/mbassy/bus/MessagePublication$State;

    const-string v3, "Scheduled"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lnet/engio/mbassy/bus/MessagePublication$State;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lnet/engio/mbassy/bus/MessagePublication$State;->Scheduled:Lnet/engio/mbassy/bus/MessagePublication$State;

    new-instance v3, Lnet/engio/mbassy/bus/MessagePublication$State;

    const-string v5, "Running"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Lnet/engio/mbassy/bus/MessagePublication$State;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lnet/engio/mbassy/bus/MessagePublication$State;->Running:Lnet/engio/mbassy/bus/MessagePublication$State;

    new-instance v5, Lnet/engio/mbassy/bus/MessagePublication$State;

    const-string v7, "Finished"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8}, Lnet/engio/mbassy/bus/MessagePublication$State;-><init>(Ljava/lang/String;I)V

    sput-object v5, Lnet/engio/mbassy/bus/MessagePublication$State;->Finished:Lnet/engio/mbassy/bus/MessagePublication$State;

    const/4 v7, 0x4

    new-array v7, v7, [Lnet/engio/mbassy/bus/MessagePublication$State;

    aput-object v0, v7, v2

    aput-object v1, v7, v4

    aput-object v3, v7, v6

    aput-object v5, v7, v8

    .line 114
    sput-object v7, Lnet/engio/mbassy/bus/MessagePublication$State;->$VALUES:[Lnet/engio/mbassy/bus/MessagePublication$State;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .line 114
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lnet/engio/mbassy/bus/MessagePublication$State;
    .locals 1

    .line 114
    const-class v0, Lnet/engio/mbassy/bus/MessagePublication$State;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lnet/engio/mbassy/bus/MessagePublication$State;

    return-object p0
.end method

.method public static values()[Lnet/engio/mbassy/bus/MessagePublication$State;
    .locals 1

    .line 114
    sget-object v0, Lnet/engio/mbassy/bus/MessagePublication$State;->$VALUES:[Lnet/engio/mbassy/bus/MessagePublication$State;

    invoke-virtual {v0}, [Lnet/engio/mbassy/bus/MessagePublication$State;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lnet/engio/mbassy/bus/MessagePublication$State;

    return-object v0
.end method
