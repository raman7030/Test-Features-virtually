.class public final Ll/۠᩷ۚ;
.super Ljava/lang/Object;
.source "H5GB"

# interfaces
.implements Ljava/util/Map$Entry;


# instance fields
.field public final synthetic ᩸:Ll/֡᩷ۚ;


# direct methods
.method public constructor <init>(Ll/֡᩷ۚ;)V
    .locals 0

    .line 155
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۠᩷ۚ;->᩸:Ll/֡᩷ۚ;

    return-void
.end method


# virtual methods
.method public final getKey()Ljava/lang/Object;
    .locals 1

    .line 158
    iget-object v0, p0, Ll/۠᩷ۚ;->᩸:Ll/֡᩷ۚ;

    return-object v0
.end method

.method public final getValue()Ljava/lang/Object;
    .locals 1

    .line 163
    iget-object v0, p0, Ll/۠᩷ۚ;->᩸:Ll/֡᩷ۚ;

    iget v0, v0, Ll/֡᩷ۚ;->ۙ:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public final setValue(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 155
    check-cast p1, Ljava/lang/Integer;

    .line 168
    iget-object v0, p0, Ll/۠᩷ۚ;->᩸:Ll/֡᩷ۚ;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    iput v1, v0, Ll/֡᩷ۚ;->ۙ:I

    return-object p1
.end method
