.class public final Ll/᩻᩸۠;
.super Ll/֨ܶ֨;
.source "C420"


# instance fields
.field public final synthetic ᩸:Ll/ۖ᩸۠;


# direct methods
.method public constructor <init>(Ll/ۖ᩸۠;)V
    .locals 0

    .line 4926
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 610
    iput-object p1, p0, Ll/᩻᩸۠;->᩸:Ll/ۖ᩸۠;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ۘ֡֨;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 610
    check-cast p2, Ljava/lang/Void;

    .line 629
    iget-object p2, p1, Ll/ۛ֡֨;->۫:Ll/ۛ֡֨;

    const/4 v0, 0x0

    .line 4927
    invoke-virtual {p2, p0, v0}, Ll/ۛ֡֨;->֫(Ll/ۤ֡֨;Ljava/util/Locale;)Ljava/lang/Object;

    .line 630
    iget-object p1, p1, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    if-eqz p1, :cond_0

    .line 631
    iget-object p2, p0, Ll/᩻᩸۠;->᩸:Ll/ۖ᩸۠;

    iget-object p2, p2, Ll/ۖ᩸۠;->᩻:Ll/۫᩸֨;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4980
    invoke-virtual {p1, p2, v0}, Ll/ۙ֨֨;->֫(Ll/᩸֨֨;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-object v0
.end method

.method public final bridge synthetic ֫(Ll/ۛ֡֨;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 610
    check-cast p2, Ljava/lang/Void;

    const/4 p1, 0x0

    return-object p1
.end method

.method public final ֫(Ll/ܳ֡֨;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 610
    check-cast p2, Ljava/lang/Void;

    .line 614
    iget-object p2, p1, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    invoke-virtual {p2}, Ll/ۙ֨֨;->ܳ֫()Z

    move-result p2

    const/4 v0, 0x0

    iget-object v1, p0, Ll/᩻᩸۠;->᩸:Ll/ۖ᩸۠;

    if-eqz p2, :cond_0

    .line 615
    iget-object p2, v1, Ll/ۖ᩸۠;->᩻:Ll/۫᩸֨;

    iget-object p1, p1, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4980
    invoke-virtual {p1, p2, v0}, Ll/ۙ֨֨;->֫(Ll/᩸֨֨;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 617
    :cond_0
    iget-object p2, v1, Ll/ۖ᩸۠;->ᩳ:Ll/ۜ᩸۠;

    invoke-virtual {p2, p1}, Ll/ۜ᩸۠;->֫(Ll/ۛ֡֨;)V

    :goto_0
    return-object v0
.end method
