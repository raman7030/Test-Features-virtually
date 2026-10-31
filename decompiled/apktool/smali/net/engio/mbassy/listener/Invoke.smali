.class public final enum Lnet/engio/mbassy/listener/Invoke;
.super Ljava/lang/Enum;
.source "Invoke.java"


# static fields
.field public static final synthetic $VALUES:[Lnet/engio/mbassy/listener/Invoke;

.field public static final enum Asynchronously:Lnet/engio/mbassy/listener/Invoke;

.field public static final enum Synchronously:Lnet/engio/mbassy/listener/Invoke;


# direct methods
.method public static constructor <clinit>()V
    .locals 5

    .line 10
    new-instance v0, Lnet/engio/mbassy/listener/Invoke;

    const-string v1, "Synchronously"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lnet/engio/mbassy/listener/Invoke;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lnet/engio/mbassy/listener/Invoke;->Synchronously:Lnet/engio/mbassy/listener/Invoke;

    new-instance v1, Lnet/engio/mbassy/listener/Invoke;

    const-string v3, "Asynchronously"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lnet/engio/mbassy/listener/Invoke;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lnet/engio/mbassy/listener/Invoke;->Asynchronously:Lnet/engio/mbassy/listener/Invoke;

    const/4 v3, 0x2

    new-array v3, v3, [Lnet/engio/mbassy/listener/Invoke;

    aput-object v0, v3, v2

    aput-object v1, v3, v4

    .line 9
    sput-object v3, Lnet/engio/mbassy/listener/Invoke;->$VALUES:[Lnet/engio/mbassy/listener/Invoke;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .line 9
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lnet/engio/mbassy/listener/Invoke;
    .locals 1

    .line 9
    const-class v0, Lnet/engio/mbassy/listener/Invoke;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lnet/engio/mbassy/listener/Invoke;

    return-object p0
.end method

.method public static values()[Lnet/engio/mbassy/listener/Invoke;
    .locals 1

    .line 9
    sget-object v0, Lnet/engio/mbassy/listener/Invoke;->$VALUES:[Lnet/engio/mbassy/listener/Invoke;

    invoke-virtual {v0}, [Lnet/engio/mbassy/listener/Invoke;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lnet/engio/mbassy/listener/Invoke;

    return-object v0
.end method
