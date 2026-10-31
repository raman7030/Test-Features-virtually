.class public final synthetic Ll/᩸ۢ֡;
.super Ljava/lang/ThreadLocal;
.source "M4LF"


# instance fields
.field public final synthetic ֫:Ll/ۚۢ֡;


# direct methods
.method public synthetic constructor <init>(Ll/ۚۢ֡;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/ThreadLocal;-><init>()V

    iput-object p1, p0, Ll/᩸ۢ֡;->֫:Ll/ۚۢ֡;

    return-void
.end method


# virtual methods
.method public final initialValue()Ljava/lang/Object;
    .locals 1

    .line 2
    iget-object v0, p0, Ll/᩸ۢ֡;->֫:Ll/ۚۢ֡;

    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/16 v0, 0x2000

    new-array v0, v0, [C

    return-object v0
.end method
