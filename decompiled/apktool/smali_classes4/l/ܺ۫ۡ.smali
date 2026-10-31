.class public final Ll/ܺ۫ۡ;
.super Ljava/lang/Object;
.source "28V5"


# static fields
.field public static final ۧ:Ljava/lang/ThreadLocal;


# instance fields
.field public final ֫:Landroid/graphics/Typeface;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 115
    new-instance v0, Ljava/lang/ThreadLocal;

    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    sput-object v0, Ll/ܺ۫ۡ;->ۧ:Ljava/lang/ThreadLocal;

    return-void
.end method

.method public constructor <init>(Landroid/graphics/Typeface;)V
    .locals 0

    .line 118
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 119
    iput-object p1, p0, Ll/ܺ۫ۡ;->֫:Landroid/graphics/Typeface;

    return-void
.end method


# virtual methods
.method public final ֫(CC)Z
    .locals 4

    .line 124
    sget-object v0, Ll/ܺ۫ۡ;->ۧ:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۡ۫ۡ;

    .line 125
    iget-object v2, p0, Ll/ܺ۫ۡ;->֫:Landroid/graphics/Typeface;

    if-eqz v1, :cond_0

    invoke-static {v1}, Ll/ۡ۫ۡ;->֫(Ll/ۡ۫ۡ;)Landroid/graphics/Typeface;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/graphics/Typeface;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    .line 126
    :cond_0
    new-instance v1, Ll/ۡ۫ۡ;

    invoke-direct {v1, v2}, Ll/ۡ۫ۡ;-><init>(Landroid/graphics/Typeface;)V

    .line 127
    invoke-virtual {v0, v1}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 129
    :cond_1
    invoke-static {v1, p1, p2}, Ll/ۡ۫ۡ;->֫(Ll/ۡ۫ۡ;CC)Z

    move-result p1

    return p1
.end method
