.class public final synthetic Ll/ۢۤ᩷;
.super Ljava/lang/Object;
.source "31K1"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ۙ:I

.field public final synthetic ᩶:I

.field public final synthetic ᩸:Ll/ۡۤ᩷;

.field public final synthetic ᩹:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ll/ۡۤ᩷;Ljava/lang/String;II)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۢۤ᩷;->᩸:Ll/ۡۤ᩷;

    iput-object p2, p0, Ll/ۢۤ᩷;->᩹:Ljava/lang/String;

    iput p3, p0, Ll/ۢۤ᩷;->᩶:I

    iput p4, p0, Ll/ۢۤ᩷;->ۙ:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 2251
    iget-object v0, p0, Ll/ۢۤ᩷;->᩸:Ll/ۡۤ᩷;

    iget-object v0, v0, Ll/ۡۤ᩷;->᩸:Ll/ۖۤ᩷;

    iget-object v1, v0, Ll/ۖۤ᩷;->᩻:Ll/᩺ۤܿ;

    sget-object v2, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Ll/ۢۤ᩷;->᩹:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " ("

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v3, p0, Ll/ۢۤ᩷;->᩶:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, "/"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v3, p0, Ll/ۢۤ᩷;->ۙ:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, ")"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ll/᩺ۤܿ;->ۧ(Ljava/lang/CharSequence;)V

    .line 2252
    iget-object v1, v0, Ll/ۖۤ᩷;->᩻:Ll/᩺ۤܿ;

    const v2, 0x7f1201da

    invoke-virtual {v1, v2}, Ll/᩺ۤܿ;->֫(I)V

    .line 2253
    iget-object v0, v0, Ll/ۖۤ᩷;->᩻:Ll/᩺ۤܿ;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ll/᩺ۤܿ;->ۧ(I)V

    return-void
.end method
