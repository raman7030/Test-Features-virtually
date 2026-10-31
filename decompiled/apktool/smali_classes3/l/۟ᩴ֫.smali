.class public final Ll/۟ᩴ֫;
.super Ljava/lang/Object;
.source "78PS"


# instance fields
.field public ֫:Ljava/lang/String;

.field public ۧ:Ljava/lang/String;

.field public ܳ:I

.field public ܽ:Ljava/lang/String;

.field public ܿ:I

.field public ᩳ:Ljava/lang/String;

.field public ᩻:Landroid/net/Uri;


# direct methods
.method public constructor <init>(Landroid/net/Uri;)V
    .locals 0

    .line 1576
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1577
    iput-object p1, p0, Ll/۟ᩴ֫;->᩻:Landroid/net/Uri;

    return-void
.end method

.method public constructor <init>(Ll/֫᩵֫;)V
    .locals 1

    .line 1580
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1581
    iget-object v0, p1, Ll/֫᩵֫;->᩻:Landroid/net/Uri;

    iput-object v0, p0, Ll/۟ᩴ֫;->᩻:Landroid/net/Uri;

    .line 1582
    iget-object v0, p1, Ll/֫᩵֫;->ᩳ:Ljava/lang/String;

    iput-object v0, p0, Ll/۟ᩴ֫;->ᩳ:Ljava/lang/String;

    .line 1583
    iget-object v0, p1, Ll/֫᩵֫;->ܽ:Ljava/lang/String;

    iput-object v0, p0, Ll/۟ᩴ֫;->ܽ:Ljava/lang/String;

    .line 1584
    iget v0, p1, Ll/֫᩵֫;->ܳ:I

    iput v0, p0, Ll/۟ᩴ֫;->ܳ:I

    .line 1585
    iget v0, p1, Ll/֫᩵֫;->ܿ:I

    iput v0, p0, Ll/۟ᩴ֫;->ܿ:I

    .line 1586
    iget-object v0, p1, Ll/֫᩵֫;->ۧ:Ljava/lang/String;

    iput-object v0, p0, Ll/۟ᩴ֫;->ۧ:Ljava/lang/String;

    .line 1587
    iget-object p1, p1, Ll/֫᩵֫;->֫:Ljava/lang/String;

    iput-object p1, p0, Ll/۟ᩴ֫;->֫:Ljava/lang/String;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/۟ᩴ֫;)Ljava/lang/String;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/۟ᩴ֫;->֫:Ljava/lang/String;

    return-object p0
.end method

.method public static bridge synthetic ۧ(Ll/۟ᩴ֫;)Ljava/lang/String;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/۟ᩴ֫;->ۧ:Ljava/lang/String;

    return-object p0
.end method

.method public static bridge synthetic ܳ(Ll/۟ᩴ֫;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/۟ᩴ֫;->ܳ:I

    return p0
.end method

.method public static bridge synthetic ܽ(Ll/۟ᩴ֫;)Ljava/lang/String;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/۟ᩴ֫;->ܽ:Ljava/lang/String;

    return-object p0
.end method

.method public static bridge synthetic ܿ(Ll/۟ᩴ֫;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/۟ᩴ֫;->ܿ:I

    return p0
.end method

.method public static bridge synthetic ᩳ(Ll/۟ᩴ֫;)Ljava/lang/String;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/۟ᩴ֫;->ᩳ:Ljava/lang/String;

    return-object p0
.end method

.method public static bridge synthetic ᩻(Ll/۟ᩴ֫;)Landroid/net/Uri;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/۟ᩴ֫;->᩻:Landroid/net/Uri;

    return-object p0
.end method


# virtual methods
.method public final ֫()Ll/֫᩵֫;
    .locals 1

    .line 1641
    new-instance v0, Ll/֫᩵֫;

    invoke-direct {v0, p0}, Ll/֫᩵֫;-><init>(Ll/۟ᩴ֫;)V

    return-object v0
.end method

.method public final ֫(Ljava/lang/String;)V
    .locals 0

    .line 1635
    iput-object p1, p0, Ll/۟ᩴ֫;->֫:Ljava/lang/String;

    return-void
.end method

.method public final ۧ()V
    .locals 1

    const/4 v0, 0x1

    .line 1614
    iput v0, p0, Ll/۟ᩴ֫;->ܳ:I

    return-void
.end method

.method public final ۧ(Ljava/lang/String;)V
    .locals 0

    .line 1628
    iput-object p1, p0, Ll/۟ᩴ֫;->ۧ:Ljava/lang/String;

    return-void
.end method

.method public final ܽ(Ljava/lang/String;)V
    .locals 0

    .line 1600
    invoke-static {p1}, Ll/ۢ᩵֫;->ۡ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ll/۟ᩴ֫;->ᩳ:Ljava/lang/String;

    return-void
.end method
