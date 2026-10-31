.class public final synthetic Ll/ۗ֡֨;
.super Ljava/lang/Object;
.source "643O"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic ֫:Ll/۫֡֨;

.field public final synthetic ۧ:Ll/ۢۗ֨;

.field public final synthetic ܽ:Ll/ܺۗ֨;

.field public final synthetic ܿ:Ll/ۢۚ۠;

.field public final synthetic ᩳ:Ll/֫ۤ֨;


# direct methods
.method public synthetic constructor <init>(Ll/۫֡֨;Ll/ۢۗ֨;Ll/ܺۗ֨;Ll/֫ۤ֨;Ll/ۢۚ۠;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۗ֡֨;->֫:Ll/۫֡֨;

    iput-object p2, p0, Ll/ۗ֡֨;->ۧ:Ll/ۢۗ֨;

    iput-object p3, p0, Ll/ۗ֡֨;->ܽ:Ll/ܺۗ֨;

    iput-object p4, p0, Ll/ۗ֡֨;->ᩳ:Ll/֫ۤ֨;

    iput-object p5, p0, Ll/ۗ֡֨;->ܿ:Ll/ۢۚ۠;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 5

    .line 2
    iget-object v0, p0, Ll/ۗ֡֨;->ܿ:Ll/ۢۚ۠;

    .line 1740
    iget-object v1, p0, Ll/ۗ֡֨;->֫:Ll/۫֡֨;

    iget-object v1, v1, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    iget-object v2, p0, Ll/ۗ֡֨;->ۧ:Ll/ۢۗ֨;

    iget-object v3, p0, Ll/ۗ֡֨;->ܽ:Ll/ܺۗ֨;

    iget-object v4, p0, Ll/ۗ֡֨;->ᩳ:Ll/֫ۤ֨;

    invoke-virtual {v2, v3, v4, v0, v1}, Ll/ۢۗ֨;->֫(Ll/ܺۗ֨;Ll/֫ۤ֨;Ll/ۢۚ۠;Ll/ۙ֨֨;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
