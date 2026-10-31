.class public abstract Ll/ܿۧۖ;
.super Ljava/lang/Object;
.source "17QI"

# interfaces
.implements Ljava/lang/Comparable;


# static fields
.field public static final synthetic ᩸:I

.field public static final ᩹:Ljava/util/Comparator;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 2712
    new-instance v0, Ll/ܽۧۖ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 2713
    invoke-static {v0}, Ll/۠۬ᩴ;->comparingInt(Ljava/util/function/ToIntFunction;)Ljava/util/Comparator;

    move-result-object v0

    sput-object v0, Ll/ܿۧۖ;->᩹:Ljava/util/Comparator;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 2674
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final compareTo(Ljava/lang/Object;)I
    .locals 1

    .line 2674
    check-cast p1, Ll/ܿۧۖ;

    .line 2717
    sget-object v0, Ll/ܿۧۖ;->᩹:Ljava/util/Comparator;

    invoke-interface {v0, p0, p1}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method public abstract ֫()Ll/᩺ۢ֨;
.end method

.method public abstract ۧ()Ll/ᩳۧۖ;
.end method

.method public abstract ܿ()Ll/ܶ۟ܺ;
.end method
