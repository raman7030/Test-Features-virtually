.class public final synthetic Ll/۬ᩳ۠;
.super Ljava/lang/Object;
.source "B7KX"

# interfaces
.implements Ll/᩵᩵֨;


# instance fields
.field public final synthetic ֫:Ll/۫ᩳ۠;

.field public final synthetic ۧ:Ll/۠֡֨;


# direct methods
.method public synthetic constructor <init>(Ll/۫ᩳ۠;Ll/۠֡֨;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۬ᩳ۠;->֫:Ll/۫ᩳ۠;

    iput-object p2, p0, Ll/۬ᩳ۠;->ۧ:Ll/۠֡֨;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/۟᩵֨;Ll/ۛ֡֨;)Z
    .locals 1

    .line 354
    iget-object p1, p2, Ll/ۛ֡֨;->ۙ:Ll/֨ᩴ֨;

    sget-object v0, Ll/֨ᩴ֨;->᩻֫:Ll/֨ᩴ֨;

    if-ne p1, v0, :cond_0

    iget-object p1, p0, Ll/۬ᩳ۠;->֫:Ll/۫ᩳ۠;

    iget-object p1, p1, Ll/۫ᩳ۠;->ۤ:Ll/ۧܿ۠;

    invoke-static {p1}, Ll/ۧܿ۠;->ܽ(Ll/ۧܿ۠;)Ll/ܶ۬֨;

    move-result-object p1

    .line 355
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object p1, p0, Ll/۬ᩳ۠;->ۧ:Ll/۠֡֨;

    invoke-static {p2, p1}, Ll/ܶ۬֨;->֫(Ll/ۛ֡֨;Ll/۠֡֨;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
