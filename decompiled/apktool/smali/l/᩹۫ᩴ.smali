.class public final Ll/᩹۫ᩴ;
.super Ljava/lang/Object;
.source "N673"


# static fields
.field public static final a:Ll/۟ۛᩴ;

.field public static final b:Ll/ۧۛᩴ;

.field public static final c:Ll/ۨۛᩴ;

.field public static final d:Ll/ܰۤᩴ;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 63
    new-instance v0, Ll/۟ۛᩴ;

    .line 838
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 63
    sput-object v0, Ll/᩹۫ᩴ;->a:Ll/۟ۛᩴ;

    .line 79
    new-instance v0, Ll/ۧۛᩴ;

    .line 838
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 79
    sput-object v0, Ll/᩹۫ᩴ;->b:Ll/ۧۛᩴ;

    .line 95
    new-instance v0, Ll/ۨۛᩴ;

    .line 838
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 95
    sput-object v0, Ll/᩹۫ᩴ;->c:Ll/ۨۛᩴ;

    .line 111
    new-instance v0, Ll/ܰۤᩴ;

    .line 838
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 111
    sput-object v0, Ll/᩹۫ᩴ;->d:Ll/ܰۤᩴ;

    return-void
.end method

.method public static a(III)V
    .locals 2

    if-gt p1, p2, :cond_2

    if-ltz p1, :cond_1

    if-gt p2, p0, :cond_0

    return-void

    .line 394
    :cond_0
    new-instance p0, Ljava/lang/ArrayIndexOutOfBoundsException;

    invoke-direct {p0, p2}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(I)V

    throw p0

    .line 391
    :cond_1
    new-instance p0, Ljava/lang/ArrayIndexOutOfBoundsException;

    invoke-direct {p0, p1}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(I)V

    throw p0

    .line 387
    :cond_2
    new-instance p0, Ljava/lang/ArrayIndexOutOfBoundsException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "origin("

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ") > fence("

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ")"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static b(Ljava/util/Iterator;I)Ll/ܳۨᩴ;
    .locals 1

    .line 478
    new-instance v0, Ll/ܳۨᩴ;

    invoke-static {p0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/Iterator;

    invoke-direct {v0, p0, p1}, Ll/ܳۨᩴ;-><init>(Ljava/util/Iterator;I)V

    return-object v0
.end method

.method public static iterator(Ll/ܶ۫ᩴ;)Ljava/util/Iterator;
    .locals 1

    .line 667
    invoke-static {p0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 696
    new-instance v0, Ll/۫ܳ᩵;

    invoke-direct {v0, p0}, Ll/۫ܳ᩵;-><init>(Ll/ܶ۫ᩴ;)V

    return-object v0
.end method

.method public static spliterator(Ljava/util/Collection;I)Ll/ܶ۫ᩴ;
    .locals 1

    .line 420
    new-instance v0, Ll/ܳۨᩴ;

    invoke-static {p0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/Collection;

    invoke-direct {v0, p0, p1}, Ll/ܳۨᩴ;-><init>(Ljava/util/Collection;I)V

    return-object v0
.end method

.method public static spliterator([IIII)Ll/ᩴ۫ᩴ;
    .locals 1

    .line 239
    invoke-static {p0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [I

    array-length v0, v0

    invoke-static {v0, p1, p2}, Ll/᩹۫ᩴ;->a(III)V

    .line 240
    new-instance v0, Ll/ܽۨᩴ;

    invoke-direct {v0, p0, p1, p2, p3}, Ll/ܽۨᩴ;-><init>([IIII)V

    return-object v0
.end method
