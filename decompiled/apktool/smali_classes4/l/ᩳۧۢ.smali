.class public final Ll/ᩳۧۢ;
.super Ljava/lang/Object;
.source "Y1KK"


# static fields
.field public static final ۜ:Ljava/util/Comparator;

.field public static final ᩻:Ljava/util/Comparator;


# instance fields
.field public ֫:I

.field public ۧ:Ll/ۧ۫᩷;

.field public final ܳ:Ljava/lang/String;

.field public ܽ:Ljava/lang/String;

.field public ܿ:Ll/ۧ۫᩷;

.field public ᩳ:I


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 9
    new-instance v0, Ll/᩹᩷ܳ;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Ll/᩹᩷ܳ;-><init>(I)V

    invoke-static {v0}, Ll/۠۬ᩴ;->comparing(Ljava/util/function/Function;)Ljava/util/Comparator;

    move-result-object v0

    sput-object v0, Ll/ᩳۧۢ;->ۜ:Ljava/util/Comparator;

    .line 10
    new-instance v0, Ll/ܿ᩶ܳ;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Ll/ܿ᩶ܳ;-><init>(I)V

    invoke-static {v0}, Ll/۠۬ᩴ;->comparing(Ljava/util/function/Function;)Ljava/util/Comparator;

    move-result-object v0

    new-instance v1, Ll/ܽۧۢ;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Ll/ܽۧۢ;-><init>(I)V

    invoke-static {v0, v1}, Ll/ܶ۬ᩴ;->thenComparing(Ljava/util/Comparator;Ljava/util/function/Function;)Ljava/util/Comparator;

    move-result-object v0

    sput-object v0, Ll/ᩳۧۢ;->᩻:Ljava/util/Comparator;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Ll/ᩳۧۢ;->ܳ:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    if-eqz p1, :cond_2

    .line 36
    const-class v0, Ll/ᩳۧۢ;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    if-eq v0, v1, :cond_1

    goto :goto_0

    .line 38
    :cond_1
    check-cast p1, Ll/ᩳۧۢ;

    .line 40
    iget-object v0, p0, Ll/ᩳۧۢ;->ܳ:Ljava/lang/String;

    iget-object p1, p1, Ll/ᩳۧۢ;->ܳ:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_2
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 1

    .line 45
    iget-object v0, p0, Ll/ᩳۧۢ;->ܳ:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0
.end method
