.class public final synthetic Ll/֨ܰ֫;
.super Ljava/lang/Object;
.source "F8QV"

# interfaces
.implements Ll/ۛܶܺ;


# instance fields
.field public final synthetic ᩸:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Ll/֨ܰ֫;->᩸:I

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 2

    .line 74
    new-instance v0, Landroid/os/HandlerThread;

    iget v1, p0, Ll/֨ܰ֫;->᩸:I

    invoke-static {v1}, Ll/ܶܰ֫;->ܳ(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    return-object v0
.end method
