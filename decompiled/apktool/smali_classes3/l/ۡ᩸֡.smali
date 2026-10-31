.class public final Ll/ۡ᩸֡;
.super Ll/֫᩶֡;
.source "E67F"


# static fields
.field public static final ۧ:Ll/۟᩹֡;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 37
    new-instance v0, Ll/ۢ᩸֡;

    .line 59
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 37
    sput-object v0, Ll/ۡ᩸֡;->ۧ:Ll/۟᩹֡;

    return-void
.end method

.method public constructor <init>(Ll/᩻᩶֡;)V
    .locals 0

    .line 40
    invoke-direct {p0, p1}, Ll/֫᩶֡;-><init>(Ll/᩻᩶֡;)V

    return-void
.end method

.method public constructor <init>(Ll/᩻᩶֡;I)V
    .locals 0

    .line 44
    invoke-direct {p0, p1}, Ll/֫᩶֡;-><init>(Ll/᩻᩶֡;)V

    return-void
.end method


# virtual methods
.method public final ۢ()Ll/᩻᩸֡;
    .locals 1

    .line 56
    sget-object v0, Ll/᩻᩸֡;->۫:Ll/᩻᩸֡;

    return-object v0
.end method

.method public final ۧ(Ll/֫ۗ֡;I)V
    .locals 0

    .line 51
    iget-object p2, p0, Ll/֫᩶֡;->֫:Ll/᩻᩶֡;

    iget-byte p2, p2, Ll/᩻᩶֡;->ۗ:B

    invoke-virtual {p1, p2}, Ll/֫ۗ֡;->ۧ(I)V

    const/4 p2, 0x0

    .line 52
    invoke-virtual {p1, p2}, Ll/֫ۗ֡;->ۧ(I)V

    return-void
.end method
