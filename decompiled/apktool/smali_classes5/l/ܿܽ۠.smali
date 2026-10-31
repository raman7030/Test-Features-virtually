.class public final Ll/ܿܽ۠;
.super Ll/᩸۫֨;
.source "A451"


# instance fields
.field public final synthetic ۧ:Ll/ܳܽ۠;

.field public final synthetic ܽ:Ll/ᩴܶ۠;


# direct methods
.method public constructor <init>(Ll/ܳܽ۠;Ll/ᩴܶ۠;)V
    .locals 0

    .line 1366
    iput-object p1, p0, Ll/ܿܽ۠;->ۧ:Ll/ܳܽ۠;

    iput-object p2, p0, Ll/ܿܽ۠;->ܽ:Ll/ᩴܶ۠;

    invoke-direct {p0}, Ll/᩸۫֨;-><init>()V

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ۤ֡۠;)V
    .locals 1

    .line 1369
    iget-object p1, p1, Ll/ۤ֡۠;->ۗ:Ll/۫᩵۠;

    if-eqz p1, :cond_0

    .line 1370
    iget-object v0, p0, Ll/ܿܽ۠;->ۧ:Ll/ܳܽ۠;

    invoke-static {v0, p1}, Ll/ܳܽ۠;->֫(Ll/ܳܽ۠;Ll/۫᩵۠;)Ll/۫᩵۠;

    move-result-object p1

    iget-object v0, p0, Ll/ܿܽ۠;->ܽ:Ll/ᩴܶ۠;

    invoke-virtual {v0, p1}, Ll/ᩴܶ۠;->֫(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method
