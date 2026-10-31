.class public final Ll/۫ܿ;
.super Ljava/lang/Object;
.source "422Y"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩸:Ll/ۚܳ;


# direct methods
.method public constructor <init>(Ll/ۚܳ;)V
    .locals 0

    .line 268
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۫ܿ;->᩸:Ll/ۚܳ;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 271
    iget-object v0, p0, Ll/۫ܿ;->᩸:Ll/ۚܳ;

    iget v1, v0, Ll/ۚܳ;->ۗ֫:I

    and-int/lit8 v1, v1, 0x1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    .line 272
    invoke-virtual {v0, v2}, Ll/ۚܳ;->᩻(I)V

    .line 274
    :cond_0
    iget v1, v0, Ll/ۚܳ;->ۗ֫:I

    and-int/lit16 v1, v1, 0x1000

    if-eqz v1, :cond_1

    const/16 v1, 0x6c

    .line 275
    invoke-virtual {v0, v1}, Ll/ۚܳ;->᩻(I)V

    .line 277
    :cond_1
    iput-boolean v2, v0, Ll/ۚܳ;->۬֫:Z

    .line 278
    iput v2, v0, Ll/ۚܳ;->ۗ֫:I

    return-void
.end method
