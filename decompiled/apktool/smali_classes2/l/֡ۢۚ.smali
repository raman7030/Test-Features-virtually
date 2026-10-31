.class public final Ll/֡ۢۚ;
.super Ljava/lang/Object;
.source "O6BJ"

# interfaces
.implements Ljava/util/Map$Entry;


# instance fields
.field public ᩸:Ljava/lang/Object;

.field public final synthetic ᩹:Ll/ۚۢۚ;


# direct methods
.method public constructor <init>(Ll/ۚۢۚ;)V
    .locals 0

    .line 83
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/֡ۢۚ;->᩹:Ll/ۚۢۚ;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/֡ۢۚ;Ljava/lang/Object;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/֡ۢۚ;->᩸:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final getKey()Ljava/lang/Object;
    .locals 1

    .line 90
    iget-object v0, p0, Ll/֡ۢۚ;->᩸:Ljava/lang/Object;

    return-object v0
.end method

.method public final getValue()Ljava/lang/Object;
    .locals 2

    .line 95
    iget-object v0, p0, Ll/֡ۢۚ;->᩹:Ll/ۚۢۚ;

    iget-object v1, p0, Ll/֡ۢۚ;->᩸:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ll/ۚۢۚ;->֫(Ljava/lang/Object;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public final setValue(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 83
    check-cast p1, Ljava/lang/Integer;

    .line 100
    iget-object v0, p0, Ll/֡ۢۚ;->᩸:Ljava/lang/Object;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iget-object v1, p0, Ll/֡ۢۚ;->᩹:Ll/ۚۢۚ;

    invoke-virtual {v1, p1, v0}, Ll/ۚۢۚ;->֫(ILjava/lang/Object;)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method
