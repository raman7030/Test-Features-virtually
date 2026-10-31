.class public final Ll/ܽܽۧ;
.super Ljava/lang/Object;
.source "L8S9"


# instance fields
.field public final ֫:[Z

.field public final ۧ:[Z

.field public final ܽ:[Z

.field public final ᩳ:Ll/ۛܽۧ;


# direct methods
.method public constructor <init>(Ll/ۛܽۧ;[Z)V
    .locals 0

    .line 1214
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1215
    iput-object p1, p0, Ll/ܽܽۧ;->ᩳ:Ll/ۛܽۧ;

    .line 1216
    iput-object p2, p0, Ll/ܽܽۧ;->ۧ:[Z

    .line 1217
    iget p1, p1, Ll/ۛܽۧ;->ۧ:I

    new-array p2, p1, [Z

    iput-object p2, p0, Ll/ܽܽۧ;->֫:[Z

    .line 1218
    new-array p1, p1, [Z

    iput-object p1, p0, Ll/ܽܽۧ;->ܽ:[Z

    return-void
.end method
