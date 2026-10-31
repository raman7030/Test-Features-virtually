.class public abstract Ll/ۧ۟֡;
.super Ljava/lang/Object;
.source "Z5Z9"


# static fields
.field public static final ֫:Ll/ۧ۟֡;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 46
    new-instance v0, Ll/ۤܰ֡;

    .line 45
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 46
    sput-object v0, Ll/ۧ۟֡;->֫:Ll/ۧ۟֡;

    return-void
.end method

.method public static ֫(Ll/۬ۛ֡;I)Ljava/util/Set;
    .locals 2

    if-eqz p1, :cond_0

    .line 90
    invoke-virtual {p0}, Ll/۬ۛ֡;->ᩳ()Ll/ۘۨ֡;

    move-result-object v0

    invoke-virtual {v0, p1}, Ll/ۘۨ֡;->ۜ(I)I

    move-result v0

    .line 91
    new-instance v1, Ll/ۛܰ֡;

    invoke-direct {v1, p0, p1, v0}, Ll/ۛܰ֡;-><init>(Ll/۬ۛ֡;II)V

    return-object v1

    .line 106
    :cond_0
    invoke-static {}, Ll/ۛ۬ܺ;->of()Ll/ۛ۬ܺ;

    move-result-object p0

    return-object p0
.end method

.method public static ۧ(Ll/۬ۛ֡;I)Ljava/util/List;
    .locals 2

    if-lez p1, :cond_0

    .line 113
    invoke-virtual {p0}, Ll/۬ۛ֡;->ᩳ()Ll/ۘۨ֡;

    move-result-object v0

    invoke-virtual {v0, p1}, Ll/ۘۨ֡;->ۜ(I)I

    move-result v0

    .line 115
    new-instance v1, Ll/ۨܰ֡;

    invoke-direct {v1, p0, p1, v0}, Ll/ۨܰ֡;-><init>(Ll/۬ۛ֡;II)V

    return-object v1

    .line 129
    :cond_0
    invoke-static {}, Ll/ܳ۬ܺ;->of()Ll/ܳ۬ܺ;

    move-result-object p0

    return-object p0
.end method

.method public static ܽ(Ll/۬ۛ֡;I)Ll/ۧ۟֡;
    .locals 1

    if-nez p1, :cond_0

    .line 81
    sget-object p0, Ll/ۧ۟֡;->֫:Ll/ۧ۟֡;

    return-object p0

    .line 83
    :cond_0
    new-instance v0, Ll/֫۟֡;

    invoke-direct {v0, p0, p1}, Ll/֫۟֡;-><init>(Ll/۬ۛ֡;I)V

    return-object v0
.end method


# virtual methods
.method public abstract ֫()Ljava/util/Set;
.end method

.method public abstract ۧ()Ll/ܰܰ֡;
.end method

.method public abstract ܽ()Ll/ܰܰ֡;
.end method

.method public abstract ᩳ()Ll/ܰܰ֡;
.end method
