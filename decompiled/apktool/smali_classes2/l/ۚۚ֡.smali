.class public final Ll/ۚۚ֡;
.super Ljava/lang/Object;
.source "Q18Y"

# interfaces
.implements Ljava/lang/Iterable;


# instance fields
.field public final ᩸:Ll/֡ۚ֡;

.field public final ᩹:Ll/֡ۚ֡;


# direct methods
.method public constructor <init>(Ll/֡ۚ֡;Ll/֡ۚ֡;)V
    .locals 0

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    iput-object p1, p0, Ll/ۚۚ֡;->᩹:Ll/֡ۚ֡;

    .line 26
    iput-object p2, p0, Ll/ۚۚ֡;->᩸:Ll/֡ۚ֡;

    return-void
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 3

    .line 31
    new-instance v0, Ll/֨ۚ֡;

    iget-object v1, p0, Ll/ۚۚ֡;->᩹:Ll/֡ۚ֡;

    iget-object v2, p0, Ll/ۚۚ֡;->᩸:Ll/֡ۚ֡;

    invoke-direct {v0, v1, v2}, Ll/֨ۚ֡;-><init>(Ll/֡ۚ֡;Ll/֡ۚ֡;)V

    return-object v0
.end method
