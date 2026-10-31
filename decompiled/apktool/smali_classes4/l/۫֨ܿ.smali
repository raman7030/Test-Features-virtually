.class public final Ll/۫֨ܿ;
.super Ljava/lang/Object;
.source "Q13J"

# interfaces
.implements Ll/ۛ֡ܿ;


# instance fields
.field public ֫:Landroid/content/ComponentName;

.field public ۧ:Z

.field public ܽ:Z


# direct methods
.method public constructor <init>(Landroid/content/ComponentName;ZZ)V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    iput-object p1, p0, Ll/۫֨ܿ;->֫:Landroid/content/ComponentName;

    .line 17
    iput-boolean p2, p0, Ll/۫֨ܿ;->ܽ:Z

    .line 18
    iput-boolean p3, p0, Ll/۫֨ܿ;->ۧ:Z

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ܽۢܳ;Ll/ᩳۜܳ;)V
    .locals 1

    .line 37
    invoke-static {p1, p2}, Ll/ۤ֨ܿ;->֫(Ll/ܽۢܳ;Ll/ᩳۜܳ;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/16 v0, 0x1388

    .line 38
    invoke-static {p2, v0}, Ll/ۢۘܳ;->֫(Ll/ᩳۜܳ;I)V

    .line 23
    iget-object v0, p0, Ll/۫֨ܿ;->֫:Landroid/content/ComponentName;

    .line 39
    invoke-static {p1, p2, v0}, Ll/ۤ֨ܿ;->֫(Ll/ܽۢܳ;Ll/ᩳۜܳ;Landroid/content/ComponentName;)V

    return-void

    .line 41
    :cond_0
    new-instance v0, Ll/۬֨ܿ;

    invoke-direct {v0, p0, p2, p1}, Ll/۬֨ܿ;-><init>(Ll/۫֨ܿ;Ll/ᩳۜܳ;Ll/ܽۢܳ;)V

    invoke-static {p1, p2, v0}, Ll/᩵ܺܳ;->֫(Ll/ܽۢܳ;Ll/ᩳۜܳ;Ll/ᩴܺܳ;)V

    return-void
.end method

.method public final ֫()Z
    .locals 1

    .line 33
    iget-boolean v0, p0, Ll/۫֨ܿ;->ۧ:Z

    return v0
.end method

.method public final ۧ()Z
    .locals 1

    .line 28
    iget-boolean v0, p0, Ll/۫֨ܿ;->ܽ:Z

    return v0
.end method

.method public final ܽ()Landroid/content/ComponentName;
    .locals 1

    .line 23
    iget-object v0, p0, Ll/۫֨ܿ;->֫:Landroid/content/ComponentName;

    return-object v0
.end method
