.class public final Ll/ܰ۫;
.super Ljava/lang/Object;
.source "2B21"

# interfaces
.implements Ll/۬ۤ;


# instance fields
.field public final synthetic ֫:Ll/ܶ۫;


# direct methods
.method public constructor <init>(Ll/ܶ۫;)V
    .locals 0

    .line 171
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܰ۫;->֫:Ll/ܶ۫;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 1

    .line 171
    check-cast p1, Ll/ۧۤ;

    if-nez p1, :cond_0

    .line 175
    new-instance p1, Ll/ۧۤ;

    const/4 v0, -0x3

    invoke-direct {p1, v0}, Ll/ۧۤ;-><init>(I)V

    .line 177
    :cond_0
    iget-object v0, p0, Ll/ܰ۫;->֫:Ll/ܶ۫;

    invoke-virtual {v0, p1}, Ll/ܶ۫;->֫(Ll/ۧۤ;)V

    return-void
.end method
