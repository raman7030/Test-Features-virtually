.class public final synthetic Ll/ᩳۡ۠;
.super Ljava/lang/Object;
.source "A7L3"

# interfaces
.implements Ll/ۡۡ۠;


# instance fields
.field public final synthetic ֫:Ll/ܺۡ۠;

.field public final synthetic ۧ:Ll/ۧۡ۠;


# direct methods
.method public synthetic constructor <init>(Ll/ܺۡ۠;Ll/ۧۡ۠;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ᩳۡ۠;->֫:Ll/ܺۡ۠;

    iput-object p2, p0, Ll/ᩳۡ۠;->ۧ:Ll/ۧۡ۠;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/֡ۖ۠;)V
    .locals 3

    .line 597
    sget-object v0, Ll/ۛᩴ۠;->֫:Ll/۫۠۠;

    .line 2884
    new-instance v0, Ll/۫۠۠;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const/4 p1, 0x1

    iget-object v2, p0, Ll/ᩳۡ۠;->ۧ:Ll/ۧۡ۠;

    aput-object v2, v1, p1

    const-string p1, "compiler"

    const-string v2, "option.not.allowed.with.target"

    invoke-direct {v0, p1, v2, v1}, Ll/۫۠۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 597
    iget-object p1, p0, Ll/ᩳۡ۠;->֫:Ll/ܺۡ۠;

    invoke-virtual {p1, v0}, Ll/ܺۡ۠;->֫(Ll/ۙ۠۠;)V

    return-void
.end method
