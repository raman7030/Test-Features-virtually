.class public final synthetic Ll/ۗᩳܳ;
.super Ljava/lang/Object;
.source "R6KO"

# interfaces
.implements Ljava/util/function/Consumer;


# instance fields
.field public final synthetic ᩶:Ll/ᩴܿܳ;

.field public final synthetic ᩸:[Z

.field public final synthetic ᩹:Ll/ܳܺ;


# direct methods
.method public synthetic constructor <init>([ZLl/ܳܺ;Ll/ᩴܿܳ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۗᩳܳ;->᩸:[Z

    iput-object p2, p0, Ll/ۗᩳܳ;->᩹:Ll/ܳܺ;

    iput-object p3, p0, Ll/ۗᩳܳ;->᩶:Ll/ᩴܿܳ;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 3

    .line 2
    check-cast p1, Ljava/lang/String;

    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 50
    iget-object v2, p0, Ll/ۗᩳܳ;->᩸:[Z

    aput-boolean v1, v2, v0

    .line 51
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "/"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/ۗᩳܳ;->᩶:Ll/ᩴܿܳ;

    invoke-virtual {v1, p1}, Ll/ᩴܿܳ;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Ll/ۗᩳܳ;->᩹:Ll/ܳܺ;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public synthetic andThen(Ljava/util/function/Consumer;)Ljava/util/function/Consumer;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/᩻ۛᩴ;->$default$andThen(Ljava/util/function/Consumer;Ljava/util/function/Consumer;)Ljava/util/function/Consumer;

    move-result-object p1

    return-object p1
.end method
