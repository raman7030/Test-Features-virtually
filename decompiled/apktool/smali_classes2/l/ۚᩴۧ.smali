.class public final Ll/ۚᩴۧ;
.super Ljava/lang/Object;
.source "M8UR"


# static fields
.field public static final ܽ:Ll/֡ᩴۧ;


# instance fields
.field public final ֫:Ll/᩶֡֫;

.field public final ۧ:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1409
    new-instance v0, Ll/֡ᩴۧ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ll/ۚᩴۧ;->ܽ:Ll/֡ᩴۧ;

    return-void
.end method

.method public constructor <init>(Landroid/text/SpannableStringBuilder;Landroid/text/Layout$Alignment;FIFIZII)V
    .locals 1

    .line 1447
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1448
    new-instance v0, Ll/᩹֡֫;

    invoke-direct {v0}, Ll/᩹֡֫;-><init>()V

    .line 1450
    invoke-virtual {v0, p1}, Ll/᩹֡֫;->֫(Ljava/lang/CharSequence;)V

    .line 1451
    invoke-virtual {v0, p2}, Ll/᩹֡֫;->ۧ(Landroid/text/Layout$Alignment;)V

    const/4 p1, 0x0

    .line 1452
    invoke-virtual {v0, p3, p1}, Ll/᩹֡֫;->֫(FI)V

    .line 1453
    invoke-virtual {v0, p4}, Ll/᩹֡֫;->֫(I)V

    .line 1454
    invoke-virtual {v0, p5}, Ll/᩹֡֫;->ۧ(F)V

    .line 1455
    invoke-virtual {v0, p6}, Ll/᩹֡֫;->ۧ(I)V

    const p1, -0x800001

    .line 1456
    invoke-virtual {v0, p1}, Ll/᩹֡֫;->ᩳ(F)V

    if-eqz p7, :cond_0

    .line 1458
    invoke-virtual {v0, p8}, Ll/᩹֡֫;->ᩳ(I)V

    .line 1460
    :cond_0
    invoke-virtual {v0}, Ll/᩹֡֫;->֫()Ll/᩶֡֫;

    move-result-object p1

    iput-object p1, p0, Ll/ۚᩴۧ;->֫:Ll/᩶֡֫;

    .line 1461
    iput p9, p0, Ll/ۚᩴۧ;->ۧ:I

    return-void
.end method

.method public static bridge synthetic ֫()Ll/֡ᩴۧ;
    .locals 1

    .line 0
    sget-object v0, Ll/ۚᩴۧ;->ܽ:Ll/֡ᩴۧ;

    return-object v0
.end method
