.class public final Ll/ۧۛܺ;
.super Ll/ۤۗܺ;
.source "056O"


# static fields
.field public static final ۨ:Ll/ۧۛܺ;


# instance fields
.field public final transient ۗ:[Ljava/lang/Object;

.field public final transient ۛ:I

.field public final transient ۤ:I

.field public final transient ۫:Ljava/lang/Object;

.field public final transient ۬:Ll/ۧۛܺ;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 35
    new-instance v0, Ll/ۧۛܺ;

    invoke-direct {v0}, Ll/ۧۛܺ;-><init>()V

    sput-object v0, Ll/ۧۛܺ;->ۨ:Ll/ۧۛܺ;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 551
    invoke-direct {p0}, Ll/ۢ۬ܺ;-><init>()V

    const/4 v0, 0x0

    .line 46
    iput-object v0, p0, Ll/ۧۛܺ;->۫:Ljava/lang/Object;

    const/4 v0, 0x0

    new-array v1, v0, [Ljava/lang/Object;

    .line 47
    iput-object v1, p0, Ll/ۧۛܺ;->ۗ:[Ljava/lang/Object;

    .line 48
    iput v0, p0, Ll/ۧۛܺ;->ۤ:I

    .line 49
    iput v0, p0, Ll/ۧۛܺ;->ۛ:I

    .line 50
    iput-object p0, p0, Ll/ۧۛܺ;->۬:Ll/ۧۛܺ;

    return-void
.end method

.method public constructor <init>(I[Ljava/lang/Object;)V
    .locals 2

    .line 551
    invoke-direct {p0}, Ll/ۢ۬ܺ;-><init>()V

    .line 55
    iput-object p2, p0, Ll/ۧۛܺ;->ۗ:[Ljava/lang/Object;

    .line 56
    iput p1, p0, Ll/ۧۛܺ;->ۛ:I

    const/4 v0, 0x0

    .line 57
    iput v0, p0, Ll/ۧۛܺ;->ۤ:I

    const/4 v1, 0x2

    if-lt p1, v1, :cond_0

    .line 58
    invoke-static {p1}, Ll/ۛ۬ܺ;->֫(I)I

    move-result v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 59
    :goto_0
    invoke-static {p1, v1, v0, p2}, Ll/ۜۛܺ;->ۧ(III[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Ll/ۧۛܺ;->۫:Ljava/lang/Object;

    const/4 v0, 0x1

    .line 60
    invoke-static {p1, v1, v0, p2}, Ll/ۜۛܺ;->ۧ(III[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 61
    new-instance v1, Ll/ۧۛܺ;

    invoke-direct {v1, v0, p2, p1, p0}, Ll/ۧۛܺ;-><init>(Ljava/lang/Object;[Ljava/lang/Object;ILl/ۧۛܺ;)V

    iput-object v1, p0, Ll/ۧۛܺ;->۬:Ll/ۧۛܺ;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;[Ljava/lang/Object;ILl/ۧۛܺ;)V
    .locals 0

    .line 551
    invoke-direct {p0}, Ll/ۢ۬ܺ;-><init>()V

    .line 71
    iput-object p1, p0, Ll/ۧۛܺ;->۫:Ljava/lang/Object;

    .line 72
    iput-object p2, p0, Ll/ۧۛܺ;->ۗ:[Ljava/lang/Object;

    const/4 p1, 0x1

    .line 73
    iput p1, p0, Ll/ۧۛܺ;->ۤ:I

    .line 74
    iput p3, p0, Ll/ۧۛܺ;->ۛ:I

    .line 75
    iput-object p4, p0, Ll/ۧۛܺ;->۬:Ll/ۧۛܺ;

    return-void
.end method


# virtual methods
.method public final get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 91
    iget v0, p0, Ll/ۧۛܺ;->ۛ:I

    iget v1, p0, Ll/ۧۛܺ;->ۤ:I

    .line 92
    iget-object v2, p0, Ll/ۧۛܺ;->۫:Ljava/lang/Object;

    iget-object v3, p0, Ll/ۧۛܺ;->ۗ:[Ljava/lang/Object;

    invoke-static {v2, v3, v0, v1, p1}, Ll/ۜۛܺ;->֫(Ljava/lang/Object;[Ljava/lang/Object;IILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    :cond_0
    return-object p1
.end method

.method public final size()I
    .locals 1

    .line 80
    iget v0, p0, Ll/ۧۛܺ;->ۛ:I

    return v0
.end method

.method public writeReplace()Ljava/lang/Object;
    .locals 1

    .line 129
    invoke-super {p0}, Ll/ۤۗܺ;->writeReplace()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()Ll/ۛ۬ܺ;
    .locals 4

    .line 106
    new-instance v0, Ll/ܿۛܺ;

    iget v1, p0, Ll/ۧۛܺ;->ۤ:I

    iget v2, p0, Ll/ۧۛܺ;->ۛ:I

    iget-object v3, p0, Ll/ۧۛܺ;->ۗ:[Ljava/lang/Object;

    invoke-direct {v0, p0, v3, v1, v2}, Ll/ܿۛܺ;-><init>(Ll/ۢ۬ܺ;[Ljava/lang/Object;II)V

    return-object v0
.end method

.method public final ۧ()Ll/ۛ۬ܺ;
    .locals 4

    .line 112
    new-instance v0, Ll/᩻ۛܺ;

    iget v1, p0, Ll/ۧۛܺ;->ۤ:I

    iget v2, p0, Ll/ۧۛܺ;->ۛ:I

    iget-object v3, p0, Ll/ۧۛܺ;->ۗ:[Ljava/lang/Object;

    invoke-direct {v0, v1, v2, v3}, Ll/᩻ۛܺ;-><init>(II[Ljava/lang/Object;)V

    .line 115
    new-instance v1, Ll/ܳۛܺ;

    invoke-direct {v1, p0, v0}, Ll/ܳۛܺ;-><init>(Ll/ۢ۬ܺ;Ll/ܳ۬ܺ;)V

    return-object v1
.end method

.method public final ܿ()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final ᩳ()Ll/ۖۙܺ;
    .locals 1

    .line 85
    iget-object v0, p0, Ll/ۧۛܺ;->۬:Ll/ۧۛܺ;

    return-object v0
.end method

.method public final ᩳ()Ll/ۤۗܺ;
    .locals 1

    .line 85
    iget-object v0, p0, Ll/ۧۛܺ;->۬:Ll/ۧۛܺ;

    return-object v0
.end method
