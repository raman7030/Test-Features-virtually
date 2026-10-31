.class public final Ll/ۙۨܿ;
.super Ljava/lang/Object;
.source "PAKQ"

# interfaces
.implements Ll/ۚۢۡ;


# instance fields
.field public final synthetic ֫:Ll/ۗۨܿ;

.field public final synthetic ۧ:Landroid/graphics/Point;


# direct methods
.method public constructor <init>(Ll/ۗۨܿ;Landroid/graphics/Point;)V
    .locals 0

    .line 340
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۙۨܿ;->֫:Ll/ۗۨܿ;

    iput-object p2, p0, Ll/ۙۨܿ;->ۧ:Landroid/graphics/Point;

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 3

    .line 343
    iget-object v0, p0, Ll/ۙۨܿ;->֫:Ll/ۗۨܿ;

    invoke-static {v0}, Ll/ۗۨܿ;->ۡ(Ll/ۗۨܿ;)I

    move-result v1

    iget-object v2, p0, Ll/ۙۨܿ;->ۧ:Landroid/graphics/Point;

    iput v1, v2, Landroid/graphics/Point;->x:I

    .line 344
    invoke-static {v0}, Ll/ۗۨܿ;->ܺ(Ll/ۗۨܿ;)I

    move-result v0

    iput v0, v2, Landroid/graphics/Point;->y:I

    return-void
.end method
