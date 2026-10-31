.class public final synthetic Ll/ۚۘ֨;
.super Ljava/lang/Object;
.source "P7M1"

# interfaces
.implements Ljava/lang/Iterable;


# instance fields
.field public final synthetic ᩶:Ljava/util/Set;

.field public final synthetic ᩸:Ljava/lang/Iterable;

.field public final synthetic ᩹:Ll/۠֡֨;


# direct methods
.method public synthetic constructor <init>(Ll/᩶ۘ֨;Ljava/lang/Iterable;Ll/۠֡֨;Ljava/util/Set;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Ll/ۚۘ֨;->᩸:Ljava/lang/Iterable;

    iput-object p3, p0, Ll/ۚۘ֨;->᩹:Ll/۠֡֨;

    iput-object p4, p0, Ll/ۚۘ֨;->᩶:Ljava/util/Set;

    return-void
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 4

    .line 736
    new-instance v0, Ll/֨ۘ֨;

    iget-object v1, p0, Ll/ۚۘ֨;->᩸:Ljava/lang/Iterable;

    iget-object v2, p0, Ll/ۚۘ֨;->᩹:Ll/۠֡֨;

    iget-object v3, p0, Ll/ۚۘ֨;->᩶:Ljava/util/Set;

    invoke-direct {v0, v1, v2, v3}, Ll/֨ۘ֨;-><init>(Ljava/lang/Iterable;Ll/۠֡֨;Ljava/util/Set;)V

    return-object v0
.end method
