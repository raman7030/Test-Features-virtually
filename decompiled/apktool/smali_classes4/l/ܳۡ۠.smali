.class public final synthetic Ll/ܳۡ۠;
.super Ljava/lang/Object;
.source "A7L3"

# interfaces
.implements Ll/ۡۡ۠;


# instance fields
.field public final synthetic ֫:Ll/ܺۡ۠;


# direct methods
.method public synthetic constructor <init>(Ll/ܺۡ۠;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܳۡ۠;->֫:Ll/ܺۡ۠;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/֡ۖ۠;)V
    .locals 3

    .line 298
    sget-object v0, Ll/ۛᩴ۠;->֫:Ll/۫۠۠;

    .line 3400
    new-instance v0, Ll/۫۠۠;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const-string p1, "compiler"

    const-string v2, "release.bootclasspath.conflict"

    invoke-direct {v0, p1, v2, v1}, Ll/۫۠۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 298
    iget-object p1, p0, Ll/ܳۡ۠;->֫:Ll/ܺۡ۠;

    invoke-virtual {p1, v0}, Ll/ܺۡ۠;->֫(Ll/ۙ۠۠;)V

    return-void
.end method
