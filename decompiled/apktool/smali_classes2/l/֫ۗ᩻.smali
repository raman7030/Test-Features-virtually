.class public final Ll/֫ۗ᩻;
.super Ll/ۤۜܳ;
.source "Z202"


# instance fields
.field public final synthetic ܿ:Ll/ۧۗ᩻;

.field public ᩳ:I


# direct methods
.method public constructor <init>(Ll/ۧۗ᩻;)V
    .locals 1

    .line 704
    iput-object p1, p0, Ll/֫ۗ᩻;->ܿ:Ll/ۧۗ᩻;

    const p1, 0x7f120601

    const v0, 0x7f0801e0

    invoke-direct {p0, p1, v0}, Ll/ۤۜܳ;-><init>(II)V

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ܽۢܳ;)V
    .locals 6

    .line 709
    sget v0, Ll/ܳ᩷ܽ;->ۡ:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    new-array v2, v0, [Ljava/lang/String;

    const v3, 0x7f1200fe

    .line 710
    invoke-static {v3}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    :goto_0
    if-ge v3, v0, :cond_0

    add-int/lit8 v5, v3, -0x1

    .line 712
    invoke-static {v5}, Ll/ܳ᩷ܽ;->ۧ(I)Ljava/lang/String;

    move-result-object v5

    aput-object v5, v2, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 714
    :cond_0
    iput v4, p0, Ll/֫ۗ᩻;->ᩳ:I

    .line 715
    iget-object v3, p0, Ll/֫ۗ᩻;->ܿ:Ll/ۧۗ᩻;

    invoke-static {v3}, Ll/ۧۗ᩻;->֫(Ll/ۧۗ᩻;)Ll/᩵ۙ᩻;

    move-result-object v3

    invoke-virtual {v3}, Ll/᩵ۙ᩻;->ۖ()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_2

    :goto_1
    if-ge v1, v0, :cond_2

    add-int/lit8 v4, v1, -0x1

    .line 718
    invoke-static {v4}, Ll/ܳ᩷ܽ;->֫(I)Ljava/nio/charset/Charset;

    move-result-object v4

    invoke-virtual {v4}, Ljava/nio/charset/Charset;->name()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    .line 719
    iput v1, p0, Ll/֫ۗ᩻;->ᩳ:I

    goto :goto_2

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 724
    :cond_2
    :goto_2
    invoke-virtual {p1}, Ll/ܽۢܳ;->ᩴ()Lbin/mt/plus/Main;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۗܺ᩷;->buildDialog()Ll/᩵ۚۢ;

    move-result-object v0

    const v1, 0x7f1205af

    .line 725
    invoke-virtual {v0, v1}, Ll/᩵ۚۢ;->ۧ(I)V

    iget v1, p0, Ll/֫ۗ᩻;->ᩳ:I

    new-instance v3, Ll/۟ۙ᩻;

    invoke-direct {v3, p0, p1}, Ll/۟ۙ᩻;-><init>(Ll/֫ۗ᩻;Ll/ܽۢܳ;)V

    .line 726
    invoke-virtual {v0, v2, v1, v3}, Ll/᩵ۚۢ;->֫([Ljava/lang/CharSequence;ILandroid/content/DialogInterface$OnClickListener;)V

    const p1, 0x7f120189

    const/4 v1, 0x0

    .line 740
    invoke-virtual {v0, p1, v1}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 741
    invoke-virtual {v0}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    return-void
.end method
