.class public final synthetic Ll/۟ܽܳ;
.super Ljava/lang/Object;
.source "970R"

# interfaces
.implements Ll/᩸ܽܳ;


# instance fields
.field public final synthetic ֫:[I

.field public final synthetic ۧ:[I


# direct methods
.method public synthetic constructor <init>([I[I)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۟ܽܳ;->֫:[I

    iput-object p2, p0, Ll/۟ܽܳ;->ۧ:[I

    return-void
.end method


# virtual methods
.method public final ֫(II)V
    .locals 3

    .line 1163
    iget-object p1, p0, Ll/۟ܽܳ;->ۧ:[I

    const/4 v0, 0x0

    aget v1, p1, v0

    add-int/lit8 v2, v1, 0x1

    aput v2, p1, v0

    iget-object p1, p0, Ll/۟ܽܳ;->֫:[I

    aput p2, p1, v1

    return-void
.end method
