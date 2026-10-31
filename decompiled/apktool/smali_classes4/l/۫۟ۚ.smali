.class public final Ll/۫۟ۚ;
.super Ll/ܰ۟ۚ;
.source "A7FF"


# instance fields
.field public ᩹:I


# direct methods
.method public constructor <init>(Ll/ᩳ֫֨;I)V
    .locals 0

    .line 120
    invoke-direct {p0, p1}, Ll/ܰ۟ۚ;-><init>(Ll/ᩳ֫֨;)V

    .line 121
    iput p2, p0, Ll/۫۟ۚ;->᩹:I

    return-void
.end method


# virtual methods
.method public final getLength()I
    .locals 1

    const/4 v0, 0x2

    return v0
.end method

.method public final ֫()Ljava/lang/String;
    .locals 1

    .line 141
    iget v0, p0, Ll/۫۟ۚ;->᩹:I

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/֡۫ۚ;)V
    .locals 1

    .line 126
    iget v0, p0, Ll/۫۟ۚ;->᩹:I

    check-cast p1, Ll/ۛ۫ۚ;

    invoke-virtual {p1, v0}, Ll/ۛ۫ۚ;->ܽ(I)V

    return-void
.end method

.method public final ܽ()Ljava/lang/String;
    .locals 3

    .line 136
    iget v0, p0, Ll/۫۟ۚ;->᩹:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    const-string v0, "{ supertype_index: %d; }"

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
