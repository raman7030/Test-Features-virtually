.class public final synthetic Ll/ᩴ۟ᩳ;
.super Ljava/lang/Object;
.source "66R4"

# interfaces
.implements Ljava/util/function/Supplier;


# instance fields
.field public final synthetic ۙ:Ll/ܳۛᩳ;

.field public final synthetic ᩶:J

.field public final synthetic ᩸:Ll/֡۟ᩳ;

.field public final synthetic ᩹:I


# direct methods
.method public synthetic constructor <init>(Ll/֡۟ᩳ;IJLl/ܳۛᩳ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ᩴ۟ᩳ;->᩸:Ll/֡۟ᩳ;

    iput p2, p0, Ll/ᩴ۟ᩳ;->᩹:I

    iput-wide p3, p0, Ll/ᩴ۟ᩳ;->᩶:J

    iput-object p5, p0, Ll/ᩴ۟ᩳ;->ۙ:Ll/ܳۛᩳ;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 5

    .line 0
    iget-wide v0, p0, Ll/ᩴ۟ᩳ;->᩶:J

    iget-object v2, p0, Ll/ᩴ۟ᩳ;->ۙ:Ll/ܳۛᩳ;

    iget-object v3, p0, Ll/ᩴ۟ᩳ;->᩸:Ll/֡۟ᩳ;

    iget v4, p0, Ll/ᩴ۟ᩳ;->᩹:I

    invoke-static {v3, v4, v0, v1, v2}, Ll/֡۟ᩳ;->֫(Ll/֡۟ᩳ;IJLl/ܳۛᩳ;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
