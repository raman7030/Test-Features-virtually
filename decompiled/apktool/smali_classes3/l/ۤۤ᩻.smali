.class public final Ll/ۤۤ᩻;
.super Ljava/lang/Object;
.source "C7AH"


# instance fields
.field public final ֫:Ljava/util/HashSet;


# direct methods
.method public constructor <init>(Ljava/util/HashSet;)V
    .locals 0

    .line 500
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 502
    iput-object p1, p0, Ll/ۤۤ᩻;->֫:Ljava/util/HashSet;

    return-void
.end method

.method public static varargs ֫([Ljava/lang/String;)Ll/ۤۤ᩻;
    .locals 5

    .line 488
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    const-string v1, "2025-11-25"

    .line 489
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 490
    array-length v1, p0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, p0, v2

    const-string v4, "supportedProtocolVersion"

    .line 491
    invoke-static {v3, v4}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    invoke-virtual {v0, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 494
    :cond_0
    new-instance p0, Ll/ۤۤ᩻;

    invoke-direct {p0, v0}, Ll/ۤۤ᩻;-><init>(Ljava/util/HashSet;)V

    return-object p0
.end method


# virtual methods
.method public final ֫(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 518
    iget-object v0, p0, Ll/ۤۤ᩻;->֫:Ljava/util/HashSet;

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p1

    :cond_0
    const-string p1, "2025-11-25"

    return-object p1
.end method

.method public final ۧ(Ljava/lang/String;)Z
    .locals 1

    .line 518
    iget-object v0, p0, Ll/ۤۤ᩻;->֫:Ljava/util/HashSet;

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method
