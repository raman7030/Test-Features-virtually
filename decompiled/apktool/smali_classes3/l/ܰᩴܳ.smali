.class public final Ll/ܰᩴܳ;
.super Ljava/lang/Object;
.source "715M"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final ᩶:[Ll/᩷ᩴܳ;

.field public ᩸:I

.field public final ᩹:I


# direct methods
.method public constructor <init>(I)V
    .locals 6

    .line 1527
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1523
    invoke-static {}, Ll/ۡᩴܳ;->ۢ()[Ll/᩷ᩴܳ;

    move-result-object v0

    iput-object v0, p0, Ll/ܰᩴܳ;->᩶:[Ll/᩷ᩴܳ;

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 1529
    :goto_0
    iget-object v2, p0, Ll/ܰᩴܳ;->᩶:[Ll/᩷ᩴܳ;

    array-length v3, v2

    const/4 v4, -0x1

    if-ge v1, v3, :cond_1

    .line 1530
    aget-object v2, v2, v1

    .line 1531
    invoke-virtual {v2}, Ll/᩷ᩴܳ;->֫()I

    move-result v3

    if-ne v3, p1, :cond_0

    .line 1533
    new-instance p1, Landroid/text/style/ForegroundColorSpan;

    sget v3, Ll/᩹֡᩷;->᩻֫:I

    invoke-direct {p1, v3}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    .line 1534
    invoke-virtual {v2}, Landroid/text/SpannableString;->length()I

    move-result v3

    const/16 v5, 0x21

    .line 1533
    invoke-virtual {v2, p1, v0, v3, v5}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    goto :goto_1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    const/4 v1, -0x1

    :goto_1
    if-eq v1, v4, :cond_2

    .line 1541
    iput v1, p0, Ll/ܰᩴܳ;->᩹:I

    .line 1542
    iput v1, p0, Ll/ܰᩴܳ;->᩸:I

    return-void

    .line 1539
    :cond_2
    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 0

    .line 1547
    iput p2, p0, Ll/ܰᩴܳ;->᩸:I

    return-void
.end method
